




document.getElementById('problemForm').addEventListener('submit', function(e){
    e.preventDefault();

    const numbers = document.getElementsByTagName('input')[0].value;
    fetch('/problems/process', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({problem: numbers})
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
        let result = document.getElementById('result');
        result.innerText = '';
        result.innerText = data.result
    })
    .catch(error => console.error(error));

})