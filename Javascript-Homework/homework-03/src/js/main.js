import darkModeBtn from './darkmode.js'
import API from './app.js'
import UI from './ui.js'


const Api = new API()
const ui = new UI()
let searchApi = document.getElementById('search-api')

AddEventListener()
function AddEventListener() {
    searchApi.addEventListener('keyup', (event) => {
        let searchText = event.target.value
        if (searchText !== '') {
            let searchApi = document.getElementById('search-api').value
            Api.getAPI().then(apis => {
            let filteredApis = SearchFilterApi(apis, searchApi)
            ui.ShowApiData(filteredApis)
        })
        }
    })
}

function SearchFilterApi(apis, searchText) {

    if (searchText) {
        let filteredApis = apis.filter(api => {
            if (api.name.toLowerCase().includes(searchText)
            || api.category.toLowerCase().includes(searchApi)
            || api.description.toLowerCase().includes(searchApi)) {
                return true
            } else {
                return false // ui.showError('danger', "YOk Kardesim YOOkkkkkkkkkkkk")
            }
        })
            return filteredApis
    } else {
        return apis
    }
}

Api.getAPI().then(data => {
    if (data.length < 1) {
        return ui.showError('warning', 'API is not found.')
    } else {
        ui.ShowApiData(data)
        ui.ShowBookmarkData(data)
    }
})
.catch(error => ui.showError(error))
