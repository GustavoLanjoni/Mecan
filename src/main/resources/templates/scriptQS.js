function toggleMenu() {
    const menu = document.querySelector('.navbar ul');
    const hamburger = document.querySelector('.hamburger');
    
    // Adiciona ou remove a classe 'active' para exibir o menu
    menu.classList.toggle('active');
    hamburger.classList.toggle('active');
}
