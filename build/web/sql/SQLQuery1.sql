select * from (
	select postid, content, ROW_NUMBER() over (order by postid asc) as [rowno]
	from Posts
) t where rowno between 4 and 6
select * from posts