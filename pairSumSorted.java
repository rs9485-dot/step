def pairSumSorted(nums, target):
    left = 0
    right = len(nums) - 1

    while (left < right):
        total = nums[left] + nums[right]

        if (total == target):
            return (nums[left], nums[right])
        elif (total < target):
            left += 1
        else:
            right -= 1

    return "Not Found"


print(pairSumSorted([-4, -1, 0, 3, 5, 9], 4))
print(pairSumSorted([1, 2, 3], 100))