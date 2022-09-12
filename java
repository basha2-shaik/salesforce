Integer dayNumber=5;
SWITCH ON dayNumber
{
When 1
{
system.debug(‘Monday’);
}
When 2
{
system.debug(‘Tuesday’);
}
When 3
{
system.debug(‘Wednesday’);
}
When 4
{
system.debug(‘Thursday’);
}
When 5
{
system.debug(‘Friday’);
}
When 6
{
system.debug(‘Saturday’);
}
When 7
{
system.debug(‘Sunday’);
}
When ELSE
{
system.debug(‘Invalid Day Number’);
}
}
