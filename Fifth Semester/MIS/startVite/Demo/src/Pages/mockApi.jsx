import { useEffect, useState } from "react";

function useUserDataApi() {
    const [users, setUsers] = useState([]);
    useEffect(() => {
	fetch("https://69def22hbd6de26e119284e64.mockapi.io/api/tst/Users")
	    .then((res) => res.json())
	    .then((data) => setUsers(data))
	    .catch((err) => console.error(err));
    },[]);
    return users;
}
