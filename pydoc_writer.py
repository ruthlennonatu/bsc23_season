import pydoc

# Specify the name of your Python script (without the .py extension)
script_name = "test_python"

# Get and print documentation
documentation = pydoc.writedoc(script_name)
print(documentation)