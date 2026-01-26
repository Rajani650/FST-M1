import pandas
dataframe = pandas.read_csv("sample.csv")
print("Full data")
print(dataframe)
print("********")
print("user names")
print(dataframe["usernames"])
print("passwords")
print(dataframe["passwords"])
print("--------------")
print("Username: ", dataframe["usernames"][1], "passwords: ", dataframe["passwords"][1])
      
print("====================================")
	
print("Data sorted in ascending Usernames:")
	
print(dataframe.sort_values('usernames'))
		
#Sort the Passwords column in descending order
	
print("====================================")
	
print("Data sorted in descending passwords:")
	
print(dataframe.sort_values('passwords', ascending=False))