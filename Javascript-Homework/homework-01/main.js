function showTime() {
    let Today = new Date()
    let hh = Today.getHours()
    let mm = Today.getMinutes()
    let ss = Today.getSeconds()

    let session = "AM"
    if (hh > 12) { session = "PM"}

    hh = (hh < 10) ? "0" + hh : hh
    mm = (mm < 10) ? "0" + mm : mm
    ss = (ss < 10) ? "0" + ss : ss

    let Time = hh + ":" + mm + ":" + ss + " " + session
    let Clock_UI = document.getElementById("myClock")

    Clock_UI.innerText = Time
    let Live_Time = setTimeout(function() { showTime()}, 1000)
}

showTime()