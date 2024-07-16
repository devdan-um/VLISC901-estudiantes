const estudiante = {
    nombre : "Joanna",
    apellido : "Reyes",
    idCurso : 1
}


fetch('http://localhost:8585/api/univer/estudiante/save', {
        method : "POST",
        body : JSON.stringify(estudiante),
        headers : {"Content-type" :  "application/json"}
    })

.then(response => {
    console.log(response)
    if(response.ok && response.status === 201 ){
        console.log('dentro de la primera promesa')
        return response.json()
    }else{
        throw Error(response.statusText)
    }
})
.then(json => {
    console.log('segunda promesa')
    console.log(json)
    return json;

})
.catch(error => console.log(error))

