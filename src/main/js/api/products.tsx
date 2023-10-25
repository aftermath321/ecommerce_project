export async function getUsers() {
    return fetch("http://localhost:8080/users").then((response) =>{
        if (!response.ok){
            throw new Error(response.statusText);
        }
        return response.json()
    })
}