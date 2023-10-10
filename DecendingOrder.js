
// 2.Perform sorting of an array in descending order.

function DescendingSort(arr) {
    const n = arr.length;
  
    for (let i = 0; i < n - 1; i++) {
      for (let j = 0; j < n - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          const temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  
const numbers = [6,8,3,2,9,0,4];
  
DescendingSort(numbers);
  
console.log(numbers); 