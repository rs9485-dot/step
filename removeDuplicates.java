def removeDuplicates(nums):
    if (len(nums) == 0):
        return 0

    unique = 1

    for i in range(1, len(nums)):
        if (nums[i] != nums[unique - 1]):
            nums[unique] = nums[i]
            unique += 1

    return unique


nums = [1, 1, 2, 2, 2, 3, 4, 4, 5]

length = removeDuplicates(nums)

print("Length =", length)
print("Array =", nums[:length])