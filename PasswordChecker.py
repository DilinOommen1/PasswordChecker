import re

def check_passwordstrength(password):
    pass_strength=0
    change = []
    
    if len(password) >= 12:
        pass_strength +=1
    else:
        change.append("Password is too short, must be at least 12 characters. ")

    if re.search(r'[A-Z]', password) and re.search(r'[a-z]', password):
        pass_strength +=1
    else:
        change.append("Password must include uppercase and lowercase letters. ")

    if re.search(r'\d', password):
        pass_strength +=1
    else:
        change.append("Passsword must include at least one number" )

    if re.search(r'[!@#$%^&*<>|]' , password):
        pass_strength +=1
    else:
        change.append("Password must include at least one special character. ")

    
    print("Password Strength Checker Says: ")
    if pass_strength == 4:
        print("Password is strong. ")
    elif pass_strength == 3:
        print("Password is okay. ")
    else:
        print("Password is weak. ")

    for c in change:
        print(" -", c)

if __name__=="__main__":
    password=input("Enter your password: ")
    check_passwordstrength(password)