// Ativar/desativar o menu hambúrguer
function toggleMenu() {
    const menu = document.querySelector('.navbar ul');
    const hamburger = document.querySelector('.hamburger');
    
    menu.classList.toggle('active');
    hamburger.classList.toggle('active');
}
