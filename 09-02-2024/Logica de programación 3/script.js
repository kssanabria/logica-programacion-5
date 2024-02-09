 //parseFloat(prompt("Ingrese un número para calcular el Factorial"))


function calcularFactorial(){
    let number = document.getElementById("number").value;
    number=parseInt(number)
    let factorial = 1;
    if(number==null || /\D/.test(number) || number== ""){
        Swal.fire({
            title: `Hola, ${number} no es un número, ingresa un número válido`,
            icon: "error",
        })
    }else{
    for(i=1; i<=number; i++){
        factorial *= i;
    }
    Swal.fire({
        title: `El factorial de ${number} es ${factorial}`,
        icon: "info",
    })
}
}

