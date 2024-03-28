let colors=['red','green','blue'];
//add yellow to the end
colors.push('yellow');
console.log(colors);
//add yellow to the begininig
colors.unshift('orange');
console.log(colors);
//remove the lat element
colors.pop();
console.log(colors);
// remove the first element
colors.shift();
console.log(colors);

// replace
const friends=['rathan','anu','sathya','anil'];
console.log(friends[0]);
console.log(friends[1]);
console.log(friends[2]);
console.log(friends.length);
console.log(friends[friends.length-1]);
// replace
friends[2]="sathatech";
console.log(friends[2]);

//splice method it will remove data
let numbers=[10,20,30,40,50];
numbers.splice(2,1);
console.log(numbers);
numbers.splice(2,0,7);
console.log(numbers);
//diff slice
numbers.splice(2,0,[1,2,3]);
console.log(numbers);
//slice method
let numbers1=[10,20,30,40,50];
let slicearray=numbers1.slice(1,3);
console.log(slicearray);

