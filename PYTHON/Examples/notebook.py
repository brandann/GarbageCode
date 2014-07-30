import datetime

#Store the next available id for all new notes
last_id = 0

class Note:
    '''Represents a note in the notebook. Match against a string in searches and store tags for each note.'''
    def __init__(self, memo, tags=''):
        '''initialize a note with memo and optional
        space-separated tags. Automatically set the note's
        creation date and a unique id.'''
        self.memo = memo
        self.tags = tags
        self.creation_date = datetime.date.today()
        global last_id
        last_id += 1
        self.id = last_id

    def match(self, filter):
        '''Determine if this note matches the filter
        text. Return True if it matches, False otherwise.

        Search is case sensitive and matches both text and
        tags.'''
        return filter in self.memo or filter in self.tags

n1 = Note("Hello first")
n2 = Note("Hello again")
n1.id
n2.id
n1.match('Hello')
n2.match('second')
