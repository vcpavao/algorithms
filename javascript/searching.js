//Sequential Search
function linearSearch(list, match) {
  for(var i = 0; i < list.length; i++) {
    if(arr[i] === match) {
      return i;
    }
  }
  return -1;
}

//Binary Search
function binarySearch(list, match) {
  var left = 0;
  var right = list.length - 1;
  var pivot = Math.floor((left + right)/2);
  while(list[pivot] !== match && left <= right) {
    if(list[pivot] < match) {
      //Recalculate left
      left = pivot + 1;
    } else {
      //Recalculate right
      right = pivot - 1;
    }
    //Recalculate pivot
    pivot = Math.floor((left + right)/2);
  }
  //Check to make sure match was found before returning
  if(list[pivot] === match) {
    return pivot;
  } else {
    return -1;
  }
}

//Testing code
var arr = [1,2,3,4,5,6,7,8,9,10];
console.log(linearSearch(arr, 8))
console.log(binarySearch(arr, 8));
