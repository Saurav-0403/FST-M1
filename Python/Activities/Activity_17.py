# Write the following data into a CSV file

import pandas as pd

data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

dataframe = pd.DataFrame(data)
dataframe.to_csv("data1.csv", index=False)