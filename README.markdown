# Mdwiki

## What is it?

MdWiki is a non-network personal wiki based on Markdown.  MdWiki uses 
an environment variable to locate the wiki directory.  The directory also
includes mdwiki.db, and sqlite3 configuration file, and a Lucene index of
the Markdown files.

## Who wrote this?

Danizen <dan@averydavis.name>

## Can I use it?

MIT License - go ahead

## Why do this, this, *THING*?

Mostly fun, but also I work in a place where we are discouraged from putting
our stuff online, use Dropbox, or run Linux on our desktops.

## Installation

Install the gem from a tarball:

    tar xzvf mdwiki-0.01.tgz
    export PATH=$PATH:mdwiki-0.01/bin

Define the location of the wiki as an environment variale:

    export MDWiKI=$HOME/wikidir
    wdwiki

Or run it with an argument

    mdwiki $HOME/wikidir

## Can I fix your thing?

If you are interested, let me know what you want to add.   You can reach me at
[dan@averydavis.name](mailto:dan@averydavis.name).   Or, you can just take it
and do what you want.  If you've developed some interesting stuff, I'd appreciate a pull request.

