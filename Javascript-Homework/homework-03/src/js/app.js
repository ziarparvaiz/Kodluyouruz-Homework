class API {

    constructor() {
        this.url = "api.json"
    }

    async getAPI() {
        const response = await fetch(this.url)
        const data = await response.json()
        return data
    }

}

export default API