fruit_shop = {
    "apple": 10,
    "banana": 20,
    "orange" : 8,
    "peaches" : 15
}

key_to_verify = input ("What are you looking for? ")
if ( key_to_verify in fruit_shop):
    print("Yes, this is available")
else:
    print ("No this is not available")