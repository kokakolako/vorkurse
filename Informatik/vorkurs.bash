#!/bin/bash

function main () {

    local numbers=(11 7 5 9 13 53 16)
    local numbers_sorted=()
    for number in ${numbers[@]}; do
        local first_number=${numbers[0]}
    done

    printf "Numbers Sorted: %s\n" $numbers_sorted
}
main
