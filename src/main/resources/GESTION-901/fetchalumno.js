const estudiante = {
    Nombre : "DIEGO",
    Apellido: "GALLAGA",
    Enrolado: true,
    IdCurso: 2,
    Telefono: 7224
}

fetch('http://localhost:8585/api/univer/estudiante/save'),{
    method: "POST",
    body: JSON.stringify(estudiante),
    headers :{"Content-type" : "application/json"}
}

.then( response =>{
    console.log(response)
    if(response.ok && response.status ===201){
        console.log('dentro de la primera promesa')
    }else{
        throw Error(response.statusText)
    }

})

.then(json => {
    console.log('segunda promesa')
    console(json)
    return json;
})

.catch(error => console.log(error))