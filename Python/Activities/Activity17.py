import pandas
data = {
    "usernames": ["admin", "charls","deku"],
    "passwords":  ["password", "Charl13", "Almight"] 
}

dataframe = pandas.DataFrame(data)
print(dataframe)
dataframe.to_csv("sample.csv", index = False)