let darkMode = localStorage.getItem('darkMode')
const darkModeBtn = document.getElementById('darkModeBtn')

const enableDarkMode = () => {
    document.body.classList.add('darkmode')
    localStorage.setItem('darkMode', 'enabled')
}

const disableDarkMode = () => {
    document.body.classList.remove('darkmode')
    localStorage.setItem('darkMode', null)
}

if (darkMode === 'enabled') {
    enableDarkMode()
}

darkModeBtn.addEventListener('click', () => {
    darkMode = localStorage.getItem('darkMode')
    if (darkMode !== 'enabled') {
        enableDarkMode()
        console.log(darkMode)
    } else {
        disableDarkMode()
        console.log(darkMode)
    }
})


export default darkModeBtn