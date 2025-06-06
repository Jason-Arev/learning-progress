import { initializeApp } from "https://www.gstatic.com/firebasejs/10.8.1/firebase-app.js";
import { getDatabase ,
        ref,
        push,
        onValue,
        remove } from "https://www.gstatic.com/firebasejs/10.8.1/firebase-database.js"

const firebaseConfig = {
  apiKey: import.meta.env.VITE_FIREBASE_API_KEY,
  authDomain: "leads-tracker-app-35500.firebaseapp.com",
  databaseURL: "https://leads-tracker-app-35500-default-rtdb.firebaseio.com/",
  projectId: "leads-tracker-app-35500",
  storageBucket: "leads-tracker-app-35500.firebasestorage.app",
  messagingSenderId: "521749843283",
  appId: "1:521749843283:web:b41606c098c3189b3025a6"
}

const app = initializeApp(firebaseConfig)
const database = getDatabase(app)
const referenceInDB = ref(database, "leads")

const inputEl = document.getElementById("input-el")
const inputBtn = document.getElementById("input-btn")
const ulEl = document.getElementById("ul-el")
const deleteBtn = document.getElementById("delete-btn")


onValue(referenceInDB, function(snapshot) {
    const snapshotExists = snapshot.exists()
    if (snapshotExists) {
        const snapshotValues = snapshot.val()
        const leads = Object.values(snapshotValues)
        render(leads)
    }
})



function render(leads) {
    let listItems = ""
    for (let i = 0; i < leads.length; i++) {
        listItems += `
            <li>
                <a target='_blank' href='${leads[i]}'>
                    ${leads[i]}
                </a>
            </li>
        `
    }
    ulEl.innerHTML = listItems
}

deleteBtn.addEventListener("dblclick", function() {
    remove(referenceInDB)
    ulEl.innerHTML = ""
})

inputBtn.addEventListener("click", function() {
    push(referenceInDB,     inputEl.value)
    inputEl.value = ""
})