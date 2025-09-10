console.log("Lab 2 - Array Object & Array Methods");

// defining an array
// method one: defining as data type

const places = ["Dharan","Hetauda","Biratnagar","Pokhara"];
console.log("Places of Nepal: "+places);
console.log(places[0]);
console.log(places[1]);
console.log(places[2]);
console.log(places[3]);

// method two: defining as an array object
const actors = new Array("Dayahang Rai","Saugat Malla","Rajesh Hamal");
console.log("Actors of Nepal: "+actors);
// console.log(actors[0]);
// console.log(actors[1]);
// console.log(actors[2]);


// accessing array elements using for loop
for (let i = 0; i < 3; i++) {
    if(actors[i]=="Rajesh Hamal"){
        console.log("He is the super star of Nepali Film Industry: " + actors[i]);
    }else{
        console.log("from loop: " + actors[i]);
    }
}
// to dynamically access the array elements, we can use array.length property
// with for loop
console.log("Total Places: ", places.length);
console.log("Total Actors: ", actors.length);

// accessig array elements using length property
for (let i = 0; i < places.length; i++) {
    console.log("from loop: " + places[i]);
}
for (let i = 0; i < actors.length; i++) {
    console.log("from loop: " + actors[i]);
}

// exercise to implement the concept from abovve snippets
// count the total number of elements in the array
// count the total number of 'Anmol' and 'Sabda' in an array
const student = ["Himal","Sabda","Anmol","Suman","Anmol","Sabda","Ms","Aarzan","Prajwal"];
let sabda_count = 0;
let anmol_count = 0;
let total_count = 0;
for (let i = 0; i < student.length; i++) {
    if(student[i]=="Sabda"){
        sabda_count++;
    }else if(student[i]=="Anmol"){
        anmol_count++;
    }
    total_count++;
}
console.log("Total Sabda in array: " + sabda_count);
console.log("Total Anmol in array: " + anmol_count);
console.log("Total count in array: " + total_count);

// for each loop
const items = ["Books","Watches","Mobiles","Baskets","Tools"];
let count = 1;
items.forEach(
    (item)=>{
        console.log("Item no: ",count,item);
        count++;
    }
);

// some of the array methods
// 1. push() - adds element in the last inde xof array
const players = ["Messi","Ronaldo","Kami","Neymar"];
console.log("Players before push: ",players);
players.push("Ronaldino");
players.push("Gopal");
console.log("Players after: ", players);

// 2. pop() - removes element from last indes of array
console.log("Players: ", players);
players.pop();
console.log("Players after removing: ", players);

// 3. shift() - removes element from first index of array
players.shift(); // will remove 'Messi'
console.log("Players before shift: ", players);

// 4. unshift() - adds element to first index of array
players.unshift("Hari");
console.log("Players after shift: ", players);

// 5. map() - creates new array from an elements of the array by mapping
// the condition that is applied
const cities = ["Dharan", "Kathmandu", "Birtamod","Hetuda","Dharan"];
let i = 0;
const cities_lower = cities.map(
    (city)=>{
        city=cities[i].toLowerCase();
        i++;
        return city;
    }
);
console.log("cities: ", cities);
console.log("cities after mapping: ", cities_lower);

// 6. filter() - creates new array by filterig the elements
const cases = ["KATHMANDU","dharan","LALITPUR","BIRTAMOD","pokhara"];
console.log("cities before mapping: ", cases);
let j=0;
const cities_case = cases.filter(
    (city)=>{
        return city === city.toLowerCase() && isNaN(city);
    }
);
console.log("cities after filtering: ", cities_case);