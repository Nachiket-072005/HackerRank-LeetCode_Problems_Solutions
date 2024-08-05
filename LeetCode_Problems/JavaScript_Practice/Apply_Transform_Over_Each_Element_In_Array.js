/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let transformedArr = [];
    let index = 0;
    for(element of arr){
        transformedArr[index] = fn(element, index);
        index++;
    }
    return transformedArr;
};