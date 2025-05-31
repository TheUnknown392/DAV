# Explain the structure of HTML with proper examples.

The HTML structure is organized in a tree like  hierarchial structure which defines how the content is displayed.

At the top, there is `<html>...</html>`. Everything in html should be within these tags. These tags define the beginning and end of html.

Within `html` tag, there is `<head>...</head>` tag. This head tag contains all the necessary metadata of current html file itself.

After `head` tag, there is `<body>...</body>` tag. This tag contains everything that can be rendered in the actual browser.

it is not strict, but it we generally include `<!DOCTYPE HTML>` at the start line before `<html>` to tell the browser that we are using html version 5. The older version of html is not commonly used for morden websites.

The HTML structure should look something like this: 


```
    <!DOCTYPE HTML>
    <html>
        <head>
            <!-- Metadata goes here -->
        </head>
        <body>
            <!-- Graphical elements go here -->
        </body>
    </html>
```
