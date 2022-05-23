alter table Users add id int identity (1,1) primary key

create table Followers(
followeruserid int not null identity (1,1) primary key,
userid1 int not null foreign key references Users(id),
userid2 int not null foreign key references Users(id)
)
drop table Followers

create table Tags(
tagname nvarchar(30) primary key,
tagcount int
)

create table Posts(
postid int identity (1,1) primary key,
content nvarchar(300),
userid int foreign key references Users(id),
reported int, --1: was reported, 0: not reported
votecount int,
commentcount int,
timecreated Datetime,
tagname nvarchar(30) not null foreign key references Tags(tagname)
)

create table Comments(
commentid int identity (1,1) primary key,
postid int foreign key references Posts(postid),
content nvarchar(300),
userid int foreign key references Users(id),
reported int, --1: was reported, 0: not reported
timecreated Datetime
)

insert Users values (
'ha@fpt.edu.vn', '1', 'Do Ngan Ha', 'us', 1, 0, 0, 0
)
select * from users
insert Posts values
('How can I be happier as a programmer?', 1, 0, 0, 0, GETDATE(), 'mentalhealth')
insert Tags values ('mentalhealth', 1)
insert Tags values ('java', 1)

insert Posts values
('Is Java the best language for beginners?', 1, 0, 0, 0, GETDATE(), 'java')

select postid, content, userid, reported, votecount, commentcount, timecreated, tagname, status from posts

alter table Comments
add status int;

update posts
set status = 1 where postid = 3
