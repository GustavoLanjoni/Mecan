const hamburger = document.querySelector('.hamburger');
const menuContainer = document.querySelector('.menu-container');

hamburger.addEventListener('click', () => {
    hamburger.classList.toggle('active');
    menuContainer.classList.toggle('active');
});
