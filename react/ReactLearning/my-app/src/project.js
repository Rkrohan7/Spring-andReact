import React from "react";

function ReadInput() {
    // let Message=""
    const [message, setMessage] = React.useState('');
    const [display, setDisplay] = React.useState('')
    const ReadInput = (event) => {
        setMessage(event.target.value)


    }

    return (
        <div className="maindiv">

            <input type='text' onChange={ReadInput} />

            <p>Message:{message}</p>

            <AnotherCompnent />
        </div>
    )
}
function AnotherCompnent() {
    const [message, setMessage] = React.useState('');
    const [display, setDisplay] = React.useState('');
    const ReadInput = (event) => {
        setMessage(event.target.value)
    }
    const displayValue = () => {
        setDisplay(message)
    }
    return (
        <div className="anotherdiv">
            <input type='text' onChange={ReadInput} />
            <button type='button' onClick={displayValue}>Read</button>
            <p>display Message :  {display}</p>
        </div>
    )
}
export default ReadInput;