export const Test = () => {
    const testJsonData = {
	"userId" : 1,
	"id" : 1,
	"title" : "some title texts",
	"body" : "some body texts"
    }
    const arrayJsonData = [
	{
	    "userId" : 2,
	    "id" : 2,
	    "name" : "Ritika",
	    "lastName" : "Bajracharya"
	}
    ]
    
    return (
	<>
	    <h1>
		My User title is
	    </h1>
	    <p>{testJsonData.title}</p>
	    <p>
		{arrayJsonData.map((item) => (
		    <div>
			<p>
			    {item?.name}
			</p>
		    </div>
		))}
	    </p>
	</>
    )
}
