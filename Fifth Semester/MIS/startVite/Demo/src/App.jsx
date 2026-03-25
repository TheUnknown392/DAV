import { useState } from 'react'
import { Button, Im } from "./Component/Button.jsx"
import './App.css'

function App() {
  const [count, setCount] = useState(0)

    return (
	<>
	    <p>
		this button came from a component
	    </p>
	    
	    <Button title={"what"} onClick={()=>console.log("ButtonOne")}/>
	    <Im path={"/src/default.jpg"} sizeX={"50"} sizeY={"50"}/>
	    <Button title={"what what"} onClick={()=>console.log("ButtonTwo")}/>
	    <Button title={"what what what"} onClick={()=>console.log("ButtonThree")}/>
	    <Button title={"This is a button"}/>
	</> 
    )
}

export default App
