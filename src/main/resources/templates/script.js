// script.js
document.querySelector(".hamburger").addEventListener("click", () => {
    const menu = document.querySelector(".menu ul");
    menu.classList.toggle("active");
});
