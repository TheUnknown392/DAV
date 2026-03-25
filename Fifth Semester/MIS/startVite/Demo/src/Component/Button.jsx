export const Button = ({title,onClick})=>{
    return(
	<>
	    <button onClick={onClick}>{title}</button>
	</>
    )
}
export const Im = ({path, sizeX, sizeY})=>{
    return(
	<>
	    <img src={path} height={sizeY} width={sizeX}/>
	</>
    )
}
