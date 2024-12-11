function toggleMenu() {
    const hamburger = document.querySelector('.hamburger');
    const menuContainer = document.querySelector('.menu-container');
    hamburger.classList.toggle('active'); /* Animação do botão */
    menuContainer.classList.toggle('active'); /* Exibe ou oculta o menu */
}
