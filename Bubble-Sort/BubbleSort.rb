#
#  run ruby BubbleSort.rb
#

def bubbleSort array
    loop do
        swapped = false

        (array.length-1).times do |i|
            if array[i] > array[i+1]
                array[i], array[i+1] = array[i+1], array[i]
                swapped = true
            end
        end

        break if not swapped
    end
    array
end

array = [2,4,1,5,7,8, -5, 0]

p bubbleSort array
