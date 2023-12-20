function customMap(arr, callback) {
    const result = [];
  
    for (let i = 0; i < arr.length; i++) {
      result.push(callback(arr[i]));
    }
  
    return result;
  }
  
 
  
  const originalArray = [1, 2, 3, 4, 5];
  
  const findMultiplesOfTwo = function (value) {
    return value * 2;
  };
  
  // Use the custom map function with the callback
  const newArray = customMap(originalArray, findMultiplesOfTwo);
  
  console.log(newArray); // Output: [2, 4, 6, 8, 10]
  