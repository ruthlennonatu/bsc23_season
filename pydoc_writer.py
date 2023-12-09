import pydoc

# Specify the name of your Python script (without the .py extension)
script_name = "test_python"
script_name_two = "selenium_python"

# Get and print documentation
documentation = pydoc.writedoc(script_name)
documentation = pydoc.writedoc(script_name_two)
print(documentation)