const input = document.getElementById('input');
const button = document.getElementById('button');
const output = document.getElementById('output');

button.onclick = () => {
    output.innerText = input.value;
}
