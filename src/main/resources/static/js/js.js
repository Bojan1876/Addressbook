/**
 * 
 */
$(function() {
	$.ajax({
		url : '/persons'
	}).done(
			function(entries) {
				var $list = $('#addressbook');
				var personTemp = $list.find('#personTemp').html();
				var detailsTemp = $list.find('#detailsTemp').html();

				$.each(entries, function(index) {
					var entry = entries[index];

					var detailsValue = '';
					$.each(entry.details, function(index) {
						var details = entry.details[index];
						detailsValue += detailsTemp.replace('{{detailsValue}}',
								details.type + ': ' + details.value);
					});

					$list.append(personTemp.replace('{{name}}', entry.name)
							.replace('{{details}}', detailsValue));
				});

			});
});