const estudiante = {
    name: "Carmen",
    apellido: "gupi",
    idCurso: 7
}
console.log ('ok')

fetch('http://localhost:8585/api/univer/estudiante/save', {
    method: "POST",
    body: JSON.stringify(estudiante),
    headers: {"Content-type" : "application/json"}
})
.then( response=> {
    console.log(response)
    if (response.ok && response.status===201){
        console.log("Dentro de la primera promesa")
        return response.json()
    }else {
        throw Error(response.statusText)
    }
})
.then (json=> {
    console.log("segunda promesa")
    console.log(json)
    return json;
})
.catch(error => console.log(error))