const estudiante = {
    nombre: "Angel",
    apellido: "Becerril",
    idCurso: 5
}

fetch('http://localhost:8585/api/univer/estudiante/save', {
    method: "POST",
    body: JSON.stringify(estudiante),
    headers: {"Content-Type": "application/json"}
})

.then(response => {
    if(response.ok && response.status===201){
        console.log("Dentro de la primera Promesa")
        return response.json()
    }else{
        throw Error(response.statusText)
    }
})

.then(json=>{
    console.log("segunda promesa ")
    console.log(json);
    return json;
})

.catch(error => {console.log(error)})
