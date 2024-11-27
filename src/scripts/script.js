// Alternar o menu mobile
const menuButton = document.querySelector('.menu-mobile');
const navMenu = document.querySelector('nav ul');

menuButton.addEventListener('click', () => {
  navMenu.style.display = navMenu.style.display === 'flex' ? 'none' : 'flex';
});
