function customForEach(arr, callback) {
    for (let i = 0; i < arr.length; i++) {
      callback(arr[i], i, arr);
    }
  }
  
  const numbers = [1, 2, 3, 4, 5];
  
  // Define a callback function to square each number
  const squareCallback = function (value, index, array) {
    console.log(`Element at index ${index}: ${value}`);
  };
  
 
  customForEach(numbers, squareCallback);
  