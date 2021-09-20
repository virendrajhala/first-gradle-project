package com.fretron.gradleTraining

class GradleHandsOn (size:Int){

    private val arr:IntArray

    init{
        arr = IntArray(size){i->i*1}
    }

    fun getArray() : IntArray{
        return arr
    }

    fun getArraySize() : Int{
        return arr.size
    }

    fun merge(arr:IntArray, l: Int, h:Int, mid:Int){

        var i = l
        var j = mid+1
        var k = l
        var res = Array(h+1){0}
        while(i<=mid && j<=h){
            if(arr[i] < arr[j]){
                res[k++] = arr[i++]
            }

            else{
                res[k++] = arr[j++]
            }
        }

        while(i<=mid){
            res[k++] = arr[i++]
        }

        while(j<=h){
            res[k++] = arr[j++]
        }

        for(z in l..h){
            arr[z] = res[z]
        }
    }

    fun mergeSort(arr: IntArray, l: Int, h: Int){
        if(l<h){
            var mid : Int = l + (h - l) / 2
            mergeSort(arr,l,mid)
            mergeSort(arr,mid+1,h)
            merge(arr,l,h,mid)
        }

    }

    fun swap(arr:IntArray, i:Int, j:Int){
        var temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }

    fun display() : Unit{
        arr.forEach{
            print("$it ")
        }
    }

    fun reverse() {
        var low = 0
        var high = arr.size - 1
        while(low < high){

            this.swap(arr,low,high)
            low++
            high--
        }
    }

}

fun main(){

    var size = 8
    val obj = GradleHandsOn(size)

    println("Array before Merge Sort : ")
    obj.reverse()
    obj.display()

    println()

    var l = 0
    var h = obj.getArraySize()-1
    println("Array after Merge Sort : ")
    obj.mergeSort(obj.getArray(),l,h)
    obj.display()

    println()
}