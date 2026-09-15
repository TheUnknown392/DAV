import { useState } from 'react'
import { Button, Im } from "./Component/Button.jsx"
import ExternalApiDataFetch from "./externDataCalling.jsx"
import './App.css'

function App() {
  const [count, setCount] = useState(0)

    return (
	<>
	    <ExternalApiDataFetch />
	</> 
    )
}

export default App
