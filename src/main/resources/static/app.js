const API = "http://localhost:8080/api/activities";

window.onload = () => {
    setTimeout(() => {
        document.getElementById("loader").style.display = "none";
        document.querySelector(".app").classList.remove("hidden");
        loadActivities();
    }, 1200);
};

async function loadActivities() {
    const res = await fetch(API);
    const data = await res.json();
    renderTable(data);
    loadStats();
}

async function addActivity() {
    const name = document.getElementById("name").value;
    const duration = document.getElementById("duration").value;
    const date = document.getElementById("date").value;

    if (!name || !duration || !date) {
        alert("Fill all fields");
        return;
    }

    await fetch(API, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ name, duration, date })
    });

    clearInputs();
    loadActivities();
}

async function filterByDate() {
    const date = document.getElementById("filterDate").value;

    if (!date) {
        alert("Select date");
        return;
    }

    const res = await fetch(`${API}/date/${date}`);
    const data = await res.json();
    renderTable(data);
}

async function deleteActivity(id) {
    await fetch(`${API}/${id}`, { method: "DELETE" });
    loadActivities();
}

function renderTable(data) {
    const table = document.getElementById("activityTable");
    table.innerHTML = "";

    if (data.length === 0) {
        table.innerHTML = `<tr><td colspan="4">No data</td></tr>`;
        return;
    }

    data.forEach(a => {
        table.innerHTML += `
            <tr>
                <td>${a.name}</td>
                <td>${a.duration} min</td>
                <td>${a.date}</td>
                <td>
                    <button onclick="deleteActivity(${a.id})">Delete</button>
                </td>
            </tr>
        `;
    });
}

function clearInputs() {
    document.getElementById("name").value = "";
    document.getElementById("duration").value = "";
    document.getElementById("date").value = "";
}

async function loadStats() {
    const todayRes = await fetch(`${API}/summary/today`);
    const weekRes = await fetch(`${API}/summary/week`);

    const today = await todayRes.json();
    const week = await weekRes.json();

    document.getElementById("todayTotal").innerText = today;
    document.getElementById("weekTotal").innerText = week;
}