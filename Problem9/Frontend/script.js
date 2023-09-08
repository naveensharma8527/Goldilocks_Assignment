const url = 'http://localhost:8080/user';

document.getElementById("loginForm").addEventListener("submit", (e) => {
    e.preventDefault();

    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    let userDetail = {
        "username": username,
        "password": password
    }

    console.log(userDetail)
    loginUser(userDetail);

    console.log("Hello bro I am working fine");
});

async function loginUser(obj){
    try {      
        const res = await fetch(`${url}/login`,{
            method: 'POST',
            body: JSON.stringify(obj),
            headers: {
                "Content-Type": "application/json"
            }
        });

        const out = await res.text();
        if(res.ok){
            alert("Welcome User" );
        }
        else{
            alert("Invalid Credential!")
        }

    } catch (error) {
        console.log(error);
    }
}