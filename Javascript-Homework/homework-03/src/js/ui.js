class UI {

    constructor() {
        this.ApiList = document.querySelector('.api-list')
        this.ApiContent = document.querySelector('.api-content')
    }

    ShowApiData(ApiUI) {
        let htmlApi = ''
            ApiUI.forEach(api => {
                htmlApi += `
                <div class="api-info">
                        <div class="api-icon">
                            <img src="${api.icon}" alt="API Icon">
                        </div>
                        <div class="api-detail">
                            <div class="api-title">
                                <h2>${api.name}</h2>
                            </div>
                            <div class="category">${api.category}</div>
                            <div class="api-description">
                                <p>${api.description}</p>
                            </div>
                        </div>
                        <div class="api-hover">
                            <button id="bookmark">
                                <svg class="w-6 h-6" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5 5a2 2 0 012-2h10a2 2 0 012 2v16l-7-3.5L5 21V5z"></path></svg>
                                Bookmark
                            </button>
                            <a href="${api.url}" target="_blank">
                                API Docs
                                <svg class="w-6 h-6" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M9 5l7 7-7 7"></path></svg>
                            </a>
                        </div>
                    </div>
                `
        
                this.ApiList.innerHTML = htmlApi
            })
    }
    
    showError(type, message) {
        const alert = document.createElement('div')
        alert.className = `alert alert-${type}`
        alert.textContent = message
    
        this.ApiContent.appendChild(alert)
    }

}

export default UI